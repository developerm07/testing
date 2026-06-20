# VS Code Setup Guide — Java / Spring Boot / Gradle / Angular / React / Python / Gherkin / Karate / MongoDB

A step-by-step setup to make VS Code work like an IDE (IntelliJ/Eclipse-style) for your stack.
Follow the sections in order.

---

## 1. Keybindings (Eclipse-style)

Search Extensions (`Ctrl+Shift+X`) for:

- **Eclipse Keybindings** (publisher: Dakara)

This remaps common shortcuts (navigation, refactor, resources) to match Eclipse instead of VS Code defaults.

---

## 2. Extensions — Search These Names in the Marketplace

Open Extensions panel (`Ctrl+Shift+X`), search each name below, and install.

### Java / Gradle / Spring Boot
- **Extension Pack for Java** (publisher: Microsoft) — core language support, debugger, test runner, Maven, Gradle for Java
- **Spring Boot Extension Pack** (publisher: VMware / Pivotal) — Spring Boot Tools, Initializr, Dashboard
- **Lombok Annotations Support for VS Code** — if you use Lombok

### Angular
- **Angular Language Service** (publisher: Angular)
- **Angular Snippets** (publisher: John Papa)

### React
- **ES7+ React/Redux/React-Native snippets** (publisher: dsznajder)
- **Auto Rename Tag** (publisher: Jun Han)
- **Auto Close Tag** (publisher: Jun Han)

### Common JS/TS (Angular + React)
- **ESLint** (publisher: Microsoft)
- **Prettier - Code formatter** (publisher: Prettier)
- **Path Intellisense** (publisher: Christian Kohler)
- **npm Intellisense** (publisher: Christian Kohler)

### Python
- **Python** (publisher: Microsoft)
- **Pylance** (publisher: Microsoft)
- **Python Debugger** (publisher: Microsoft)
- **Black Formatter** (publisher: Microsoft) — or autopep8/isort if you prefer
- **isort** (publisher: Microsoft)

### Gherkin / Karate
- **Cucumber (Gherkin) Full Support** (publisher: Alexander Krechik) — covers Karate `.feature` syntax highlighting too

### Database (MongoDB + SQL, IntelliJ-style grid view)
- **Database Client** (publisher: Weijan Chen / cweijan)
  - For **MongoDB / Redis**: connects via native driver, using a plain `mongodb://` connection string — no JDBC involved
  - For **SQL databases** (MySQL, PostgreSQL, SQL Server, Oracle, SQLite): connects via JDBC drivers
  - Gives a connection tree + spreadsheet-style grid view (editable, filterable) — much closer to IntelliJ's DB tool window than MongoDB Compass or the official MongoDB extension's Playground

### GraphQL
- **GraphQL: Language Feature Support** (publisher: GraphQL Foundation)

### General Quality-of-Life
- **EditorConfig for VS Code** (publisher: EditorConfig)
- **GitLens** (publisher: GitKraken)
- **Docker** (publisher: Microsoft)
- **YAML** (publisher: Red Hat)

---

## 3. Global `settings.json` (applies to every project automatically)

Open with `Ctrl+Shift+P` → **"Preferences: Open User Settings (JSON)"** and merge this in.
**Update the Java/Gradle paths to match your machine.**

```json
{
  "java.jdt.ls.java.home": "/usr/lib/jvm/jdk-17",
  "java.configuration.runtimes": [
    {
      "name": "JavaSE-17",
      "path": "/usr/lib/jvm/jdk-17",
      "default": true
    }
  ],
  "java.import.gradle.home": "/opt/gradle/gradle-8.5",
  "java.import.gradle.wrapper.enabled": false,
  "java.import.gradle.userHome": "/home/yourname/.gradle",

  "editor.formatOnSave": true,
  "editor.tabSize": 2,
  "files.autoSave": "onFocusChange",

  "[java]": {
    "editor.tabSize": 4
  },

  "python.defaultInterpreterPath": "/usr/bin/python3",
  "python.formatting.provider": "black",

  "eslint.validate": ["javascript", "typescript", "html"],
  "prettier.singleQuote": true,

  "cucumberautocomplete.steps": [
    "src/test/resources/features/**/*.feature"
  ],
  "cucumberautocomplete.syncfeatures": true,

  "window.openFoldersInNewWindow": "on",
  "window.openFilesInNewWindow": "off"
}
```

> Note: `window.openFoldersInNewWindow: "on"` makes VS Code always open a new project in its **own window**, matching IntelliJ's default behavior, instead of replacing your current window.

---

## 4. Multi-Root Workspace (`.code-workspace`)

Since you don't switch Java/Gradle versions per project, this is just for grouping your repos together — equivalent to an IntelliJ multi-module project.

Save as e.g. `myapp.code-workspace`, then `File → Open Workspace from File`:

```json
{
  "folders": [
    { "name": "backend-service-a", "path": "backend-service-a" },
    { "name": "backend-service-b", "path": "backend-service-b" },
    { "name": "frontend-react-app", "path": "frontend-react-app" },
    { "name": "frontend-angular-app", "path": "frontend-angular-app" },
    { "name": "automation-karate", "path": "automation-karate" }
  ]
}
```

---

## 5. Opening Projects in a New Window (like IntelliJ)

| Action | VS Code Equivalent |
|---|---|
| Open folder/project in a new window | `File → Open Folder...` (with the setting from Section 3, this happens automatically) |
| Open a file in a split pane (same window) | Right-click file in Explorer → **"Open to the Side"** |
| Force a new window from terminal | `code -n /path/to/project` |

With `window.openFoldersInNewWindow: "on"` set globally, every new project you open behaves like IntelliJ — its own window, current one untouched.

---

## 6. Database Client Setup (MongoDB grid view, not Compass/Playground)

1. Search Extensions for **"Database Client"** → install
2. Click its icon in the Activity Bar (left sidebar)
3. Click **Add Connection** → choose **MongoDB** → paste your connection string (e.g. `mongodb://localhost:27017`) — this is a native Mongo connection, not JDBC
4. Expand the tree: server → database → collections
5. Double-click a collection → opens a spreadsheet-style grid (editable, filterable, sortable) — no code/Playground required
6. Optional: drag this panel's tab down into the bottom area (next to Terminal) to dock it there permanently, instead of the sidebar

> If you later connect a SQL database (MySQL/Postgres) with this same extension, that connection type uses JDBC drivers — separate from the Mongo native connection above.

---

## 7. Split Theme: Light Editor/Console + Dark Sidebar

VS Code applies one base theme, but you can override specific UI areas' colors independently — giving a light (Solarized-style) editor/terminal while keeping the sidebar/project tree dark.

Add this to your global `settings.json` (same file as Section 3):

```json
{
  "workbench.colorTheme": "Default Dark+",

  "workbench.colorCustomizations": {
    "editor.background": "#FDF6E3",
    "editor.foreground": "#586E75",
    "editorLineNumber.foreground": "#93A1A1",
    "editorCursor.foreground": "#586E75",
    "editor.selectionBackground": "#EEE8D5",
    "editorWhitespace.foreground": "#EEE8D5",

    "terminal.background": "#FDF6E3",
    "terminal.foreground": "#586E75",

    "panel.background": "#FDF6E3",

    "sideBar.background": "#002B36",
    "sideBar.foreground": "#93A1A1",
    "activityBar.background": "#002B36",
    "activityBar.foreground": "#93A1A1",
    "statusBar.background": "#002B36",
    "statusBar.foreground": "#93A1A1"
  }
}
```

What each part controls:
- `editor.*` → the code editor area (set to Solarized Light)
- `terminal.*` → integrated terminal/output console (set to light, matching editor)
- `panel.background` → bottom panel (Terminal/Output/Problems/Database Client if docked there)
- `sideBar.*`, `activityBar.*`, `statusBar.*` → kept dark (Solarized Dark) for the project tree, icons, status bar

**Honest caveat:** This is a manual color override list layered on top of one base theme — VS Code doesn't natively support two separate theme files for different panes simultaneously. But the visual result (light code/console, dark tree) matches what you're after. Full list of overridable keys: search `workbench.colorCustomizations` in Settings (UI) — 100+ keys available if you want to fine-tune further.

---

## Quick Reference: What to Do First

1. Install Eclipse Keybindings (Section 1)
2. Install all extensions listed (Section 2)
3. Paste combined settings into global `settings.json` (Sections 3 + 7 merged)
4. Create your `.code-workspace` file for multi-project setup (Section 4)
5. Set up Database Client connection for Mongo (Section 6)
6. Restart VS Code
