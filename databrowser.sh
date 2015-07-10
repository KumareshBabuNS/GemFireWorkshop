export GEMFIRE=/Users/papicella/gemfire/vFabric_GemFire_7015_b42134

export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.7.0_25.jdk/Contents/Home
export GF_JAVA=$JAVA_HOME/bin/java

export PATH=$JAVA_HOME/bin:$GEMFIRE/bin:$PATH
export CURDIR=`pwd`

export CLASSPATH=$GEMFIRE/lib/gemfire.jar:$GEMFIRE/lib/antlr.jar:\
$GEMFIRE/lib/gfsh-dependencies.jar:$GEMFIRE/lib/gfSecurityImpl.jar:\
$GEMFIRE/lib/jackson-core-asl-1.9.9.jar:\
$GEMFIRE/lib/commons-logging.jar:\
$GEMFIRE/lib/tomcat-embed-core.jar:\
$GEMFIRE/lib/tomcat-embed-logging-juli.jar:\
$GEMFIRE/lib/tomcat-embed-jasper.jar:\
$CURDIR/lib/deptemp.jar

$GEMFIRE/tools/DataBrowser/bin/databrowser

