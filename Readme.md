## About
this is a small reproducer project of a non-trivial Gradle build and usage of the Snyk plugin for vulnerability scanning.

## Topics

### Project renaming
To get unique build file names for better file open support within an IDE the build files are getting dynamically assigned to its project name in the settings file.
This is taken into account by provifing a dynamic file argument to the plugin configuration:
```
setArguments("--file=${projectDir}/${project.name}.gradle.kts --package-manager=gradle
```
This also requires the package manager to be set explicitly.

### Gradle Lockfile

We did not quite understand initially the benefit of having a Gradle lockfile will be beneficial for Snyk as the effective gradle resolution is always used for scanning via the Gradle Wrapper. A cli argument to enable scanning based on the Gradle Lockfile would be a nice improvement. This file would be much easier to parse and to look for in the file tree.
We did not try out the git import.

### Kotlin example
The Readme lacks the example for the Kotlin configuration. See [#PR 20](https://github.com/snyk/gradle-plugin/pull/20)


