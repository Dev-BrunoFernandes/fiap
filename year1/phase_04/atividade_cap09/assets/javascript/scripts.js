const togglePassword = document.querySelector('#togglePassword');
const password = document.querySelector('#input4');

togglePassword.addEventListener('click', function (e) {
    // Troca o tipo do input
    const type = password.getAttribute('type') === 'password' ? 'text' : 'password';
    password.setAttribute('type', type);
    
    // Troca o ícone (olho aberto / olho fechado)
    this.querySelector('i').classList.toggle('bi-eye');
    this.querySelector('i').classList.toggle('bi-eye-slash');
});