plugins {
    id("snyk.sample.js-common-conventions")
}

tasks.named("snyk-test") {
    dependsOn("npmInstall")
}

tasks.named("snyk-monitor") {
    dependsOn("npmInstall")
}