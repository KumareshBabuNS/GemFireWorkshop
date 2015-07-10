export GEMFIRE=/Programs/pivotal/Pivotal_GemFire_800_b48398_Linux

export JAVA_HOME=$(/usr/libexec/java_home -v 1.8)

# Note: the above on OSX resolves to:
#export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_20.jdk/Contents/Home

export GF_JAVA=$JAVA_HOME/bin/java

export PATH=$JAVA_HOME/bin:$GEMFIRE/bin:$PATH
