#!/usr/bin/env groovy
def VERSION = 'UNKNOWN'

pipeline {
  agent none
  environment {
    DOCKER_REPO_NAME = "cmays/twitter-analyzer"
  }

  tools {
    maven "M3"
  }

  stages {
    stage('Build') {
      agent any
      steps {
        sh 'mvn versions:set -DremoveSnapshot=true'
        script  {
          VERSION = sh(script: 'mvn org.apache.maven.plugins:maven-help-plugin:3.1.0:evaluate -Dexpression=project.version -q -DforceStdout --batch-mode',returnStdout: true)
        }
        echo "${VERSION}"
        sh 'mvn clean verify'
      }
    }
  }
}