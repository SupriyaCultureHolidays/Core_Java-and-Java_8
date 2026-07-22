// @Service annotation বসাও। এখন দুইটা dependency — UserRepository আর NotificationService,
// দুইটাই constructor-এ নিবে (@Autowired)
public class UserService {

    // private UserRepository userRepository;
    // private NotificationService notificationService;

    // constructor(UserRepository userRepository, NotificationService notificationService)

    // createUser(String name) — userRepository.save(name) করো, তারপর
    // notificationService.send("Welcome " + name + "!") করো
}
