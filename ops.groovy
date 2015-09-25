@Grab("spring-boot-actuator")
@Grab("spring-boot-starter-remote-shell")
@RestController
class App {
    @RequestMapping("/")
    def home() {
        "Hello, world!"
    }
}