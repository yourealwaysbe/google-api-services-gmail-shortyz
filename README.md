
Stubs of Google Play Gmail Services for drop-in replacement of closed-source
Google code.

Primarily for F-Droid compilation of Shortyz crossword.  Potential for
other uses.

Can use as a source library, or via jitpack.io.  For jitpack.io, add the
following to your build.gradle.  The top level needs
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
    ...
}
```
The dependency to include in the app build.gradle is
```
    compile 'com.github.yourealwaysbe:google-api-services-gmail-shortyz:v1'
```
adjusting v1 as necessary.

