document.addEventListener("DOMContentLoaded", function () {
    // Smooth GSAP animation for container
    gsap.from(".content-container", { duration: 1.5, opacity: 0, y: 50 });

    // Navbar interakcija: Aktivni link
    const navbarLinks = document.querySelectorAll(".navbar-menu a");
    navbarLinks.forEach(link => {
        link.addEventListener("click", function () {
            navbarLinks.forEach(nav => nav.classList.remove("active"));
            this.classList.add("active");
        });
    });

    // Debugging poruka u konzoli
    console.log("Welcome to Ninerr! Smooth animations powered by GSAP.");

    document.addEventListener("DOMContentLoaded", function () {
        // GSAP animacija za učitavanje liste poslova
        gsap.from(".job-list li", {
            duration: 0.5,
            opacity: 0,
            y: 20,
            stagger: 0.2
        });

        console.log("Job page animations initialized!");
    });

});



