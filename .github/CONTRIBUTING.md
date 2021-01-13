## Pull Requests

Please follow these steps to have your contribution considered by the maintainers:
- Pull actual branch where need to do changes
- Follow the [styleguides](#styleguides) when making changes
- Create PR with [template](PULL_REQUEST_TEMPLATE.md)

## Styleguides

### Git Commit Messages

- Use the present tense ("add feature" not "added feature")
- Use the imperative mood ("move cursor to..." not "moves cursor to...")
- Limit the first line to 50 characters or less
- Limit body to 72 characters or less
- Reference issues and pull requests liberally after the first line
- The first line of the commit contains the name of the artifact (task/test/doc) and the name of the module
- Consider starting the commit message with:
    - `task:` when adding/fixing/deleting tasks
    - `test:` when adding/fixing/deleting tasks
    - `example:` when adding/fixing/deleting tasks
    - `doc:` when adding/updating/deleting documentation
    - `git:` when to merge or to do another operation with git
    - `ci:` when adding/updating/refactoring CI
    - `util:` when adding/updating/deleting utils
    - etc.

### Packages

The packages structure is as follows:

```out
main.java.com.rakovets.rakovets.course
    |- util
    +- java.basic
        |- theme1
            |- example
                |- *.java
                |- ...
                +- *.java
            |- Task1.java
            |- Task2.java
            |- ...
            |- TaskN.java
            +- tasks.md
        |- theme2
        |- ...
        +- themeN
            |- subtheme1
            |- subtheme2
            |- ...
            |- subthemeN
```

where:
- `themeN` - main theme
- `subthemeN` - subtheme for main theme (example: `collection.list`, where `collection` - main theme, `list` - subtheme)
- `example` - contains examples for current theme
- `TaskN.java` - task for current theme

### Java Code Style

All Java code must adhere to [Java Style Code](https://wiki-java-basic.dmitryrakovets.com/#/common/code-convention)
