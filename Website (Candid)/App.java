// Smooth Scrolling for Anchor Links
document.querySelectorAll('.nav-link').forEach(link => {
    link.addEventListener('click', function(e) {
        e.preventDefault();
        const targetSection = document.querySelector(this.getAttribute('href'));
        targetSection.scrollIntoView({ behavior: 'smooth' });
    });
});

// Additional Interactivity Placeholder
// Use this space to add functions for future enhancements, like dynamic product loading or interactive animations.
