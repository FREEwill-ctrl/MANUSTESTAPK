#!/usr/bin/env bash

##############################################################################
##
##  Gradle wrapper script for Unix
##
##############################################################################

# Determine the Java command to use to start the JVM.
if [ -n "$JAVA_HOME" ] ; then
    if [ -x "$JAVA_HOME/jre/sh/java" ] ; then
        # IBM Java on Linux
        JAVA_CMD="$JAVA_HOME/jre/sh/java"
    else
        JAVA_CMD="$JAVA_HOME/bin/java"
    fi
    if [ ! -x "$JAVA_CMD" ] ; then
        echo "ERROR: JAVA_HOME is set to an invalid directory: $JAVA_HOME\n\nIf this were a JDK, that error would not occur. Please set JAVA_HOME to your JDK installation." >&2
        exit 1
    fi
else
    JAVA_CMD="java"
fi

APP_HOME=$(dirname "$0")

# OS specific support (must be 'true' or 'false').
cygwin=false
darwin=false
case "$(uname)" in
  CYGWIN*) cygwin=true;;
  Darwin*) darwin=true;;
esac

# For Cygwin, ensure paths are in UNIX format before anything else.
if $cygwin ; then
    APP_HOME=$(cygpath --unix "$APP_HOME")
fi

# Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS to pass JVM options to this script.
DEFAULT_JVM_OPTS="-Xmx64m -Xms64m"

# Collect all arguments for the Java command
JAVA_OPTS="$DEFAULT_JVM_OPTS $JAVA_OPTS $GRADLE_OPTS"

# Determine the class path for the wrapper
CLASSPATH="$APP_HOME/gradle/wrapper/gradle-wrapper.jar"

# Execute the wrapper
"$JAVA_CMD" $JAVA_OPTS -classpath "$CLASSPATH" org.gradle.wrapper.GradleWrapperMain "$@"


