node {
   def mvnHome
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/saikumarkalakota/SpringBootWebApp.git'
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured in the global tool configuration.           
      mvnHome = tool 'M3'
      //configured JDK-1.8 tool under Global Tool Configuration page of Jenkins 2.319 with Install automatically option checked
      env.JAVA_HOME = tool 'JDK-1.8'
   }
   stage('Build') {
      // Run the maven build
      withEnv(["MVN_HOME=$mvnHome"]) {
      //Machine is not Unix so if condition fails
         if (isUnix()) {
            sh '"$MVN_HOME/bin/mvn" -Dmaven.test.failure.ignore clean install'
         } else {
            bat(/"%MVN_HOME%\bin\mvn" -Dmaven.test.failure.ignore clean package/)
         }
      }
   }
   stage('Results') {
    //   junit '**/target/surefire-reports/TEST-*.xml'
      archiveArtifacts 'target/*.jar'
   }
}
