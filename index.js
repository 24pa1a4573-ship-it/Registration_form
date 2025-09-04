document.getElementById("capstoneRegistration").addEventListener("submit", function(e) {
    e.preventDefault();

    // Get form values
    let fullName = document.getElementById("fullName").value.trim();
    let email = document.getElementById("email").value.trim();
    let phone = document.getElementById("phone").value.trim();
    let password = document.getElementById("password").value.trim();
    let role = document.getElementById("role").value;
    let bio = document.getElementById("bio").value.trim();

    // Error elements
    let fullNameError = document.getElementById("fullNameError");
    let emailError = document.getElementById("emailError");
    let phoneError = document.getElementById("phoneError");
    let passwordError = document.getElementById("passwordError");
    let roleError = document.getElementById("roleError");
    let bioError = document.getElementById("bioError");
    let successMessage = document.getElementById("successMessage");

    // Reset errors
    fullNameError.textContent = "";
    emailError.textContent = "";
    phoneError.textContent = "";
    passwordError.textContent = "";
    roleError.textContent = "";
    bioError.textContent = "";
    successMessage.style.display = "none";

    let isValid = true;

    // Full Name Validation
    if (fullName.length < 3) {
        fullNameError.textContent = "Full name must be at least 3 characters.";
        isValid = false;
    }

    // Email Validation
    let emailPattern = /^[^ ]+@[^ ]+\.[a-z]{2,3}$/;
    if (!emailPattern.test(email)) {
        emailError.textContent = "Enter a valid email.";
        isValid = false;
    }

    // Phone Validation
    let phonePattern = /^[0-9]{10}$/;
    if (!phonePattern.test(phone)) {
        phoneError.textContent = "Phone must be 10 digits.";
        isValid = false;
    }

    // Password Validation
    if (password.length < 6) {
        passwordError.textContent = "Password must be at least 6 characters.";
        isValid = false;
    }

    // Role Validation
    if (role === "") {
        roleError.textContent = "Please select a role.";
        isValid = false;
    }

    // Bio Validation
    if (bio.length < 10) {
        bioError.textContent = "Bio must be at least 10 characters.";
        isValid = false;
    }

    // If all valid
    if (isValid) {
        successMessage.style.display = "block";
        document.getElementById("capstoneRegistration").reset();
    }
});