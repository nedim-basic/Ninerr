package ptf.si.ninerr.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import ptf.si.ninerr.Models.AppUser;
import ptf.si.ninerr.Repositories.AppUserRepository;

@Controller
public class RegistrationController {

    @Autowired
    private AppUserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public String registerUser(AppUser user, Model model) {
        // Encode the password
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        // If the user provided a role, ensure it doesn't have the "ROLE_" prefix
        if (user.getRole() != null) {
            user.setRole(user.getRole().replace("ROLE_", "").trim());
        }

        // If no role is provided or the role is empty, set a default "USER" role
        if (user.getRole() == null || user.getRole().isEmpty()) {
            user.setRole("APPUSER");
        }

        // Save the user to the repository
        userRepository.save(user);

        model.addAttribute("successMessage", "Registration successful. You can now login.");
        return "redirect:/login";
    }
}