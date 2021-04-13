plugins {
    `maven-publish`
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            artifactId = "frpclib"
            groupId = "top.chuxubank.frp"
            version = "0.36.2"
            artifact("frpclib.aar")
            artifact("frpclib-sources.jar") {
                classifier = 'sources'
            }
        }
    }
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/chuxubank/frplib")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
