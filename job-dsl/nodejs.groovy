job('NodeJS example') {
    scm {
       // git('https://github.com/wardviaene/docker-demo.git') {  node -> // is hudson.plugins.git.GitSCM
       //     node / gitConfigName('DSL User')
       //     node / gitConfigEmail('jenkins-dsl@newtech.academy')
       // }
        git('https://github.com/Shashank085236/docker-demo.git') { node ->
              node / gitConfigName('Shashank085236')
              node / gitConfigEmail('dwivedi.shashank@outlook.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
