@RestController
public class TestController {
    

    @GetMapping("/test")
    public String test(){
        return "hello";
    }
}
