package ptf.si.ninerr.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptf.si.ninerr.Models.AppUser;
import ptf.si.ninerr.Repositories.AppUserRepository;

import java.util.Optional;

@Service
public class AppUserService {
    @Autowired
    private AppUserRepository appUserRepository;

    public AppUser save(AppUser appUser) {
        return appUserRepository.save(appUser);
    }

    public Optional<AppUser> findByUsername(String username) {
        return appUserRepository.findByUsername(username);
    }

    public Optional<AppUser> findById(Long id) {
        return appUserRepository.findById(id);
    }

    public void deleteById(Long id) {
        appUserRepository.deleteById(id);
    }

    public Iterable<AppUser> findAll() {
        return appUserRepository.findAll();
    }

    public boolean existsById(Long id) {
        return appUserRepository.existsById(id);
    }

    public long count() {
        return appUserRepository.count();
    }
}