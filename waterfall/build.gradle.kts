repositories {
    maven("https://papermc.io/repo/repository/maven-public/")
}
dependencies{
    implementation(project(":common"))
    compileOnly("io.github.waterfallmc:waterfall-api:1.18-R0.1-SNAPSHOT")
}
