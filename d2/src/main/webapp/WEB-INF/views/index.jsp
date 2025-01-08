<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My Portfolio</title>
    <link rel="stylesheet" href="style.css">
    <script src="https://unpkg.com/ionicons@5.4.0/dist/ionicons.js"></script>
    <script src="./p.js"></script>
</head>

<body>
    Time:<span class="span"></span><br>
    Date:<span class="span"></span>

    <div class="navbar">
        <a href="#home"><img src="./logo.png" class="logo" alt="Logo"></a>
        <div class="menu-icon" onclick="toggleMenu()">
            <ion-icon name="menu"></ion-icon>
        </div>
        <ul>
            <li><a href="#home">HOME</a></li>
            <li><a href="#about">ABOUT</a></li>
            <li><a href="#skills">SKILLS</a></li>
            <li><a href="#projects">PROJECTS</a></li>
            <li><a href="#contact">CONTACT</a></li>
        </ul>
    </div>

    <section id="home">
        <img src="./photo1.jpg" alt="">
        <h3>Hi, I'm <span>V Sreenivas Reddy</span>.</h3>
        <h1><span>Java</span> Full Stack <span>Developer</span></h1>
        <a href="#contact">Hire Me</a>
        <div class="icons">
            <a href="https://www.facebook.com/venapusa.sreenivasareddy"><ion-icon name="logo-facebook"></ion-icon></a>
            <a href="https://www.instagram.com/sree_5113/"><ion-icon name="logo-instagram"></ion-icon></a>
            <a href="https://www.linkedin.com/in/v-sreenivasa-reddy-sree-a5n2003a/"><ion-icon name="logo-linkedin"></ion-icon></a>
        </div>
    </section>

    <section id="about">
        <h2>About Me</h2>
        <p>I am a passionate developer and hospitality professional with <span>expertise in Java Full Stack Development</span> <br> and a strong background in Hotel and Hospitality Management.</p>
        <h3>Education</h3>
        <p>Degree- Complected BHMCT from Aims College of Hotel Management and Hospitality Management Hyderabad in
            2024 with <span> 7.50 CGPA </span>.</p>
        <p>12th from Narayana Junior College Pulivendula in 2021 with <span> grand total of 621 </span>.</p>
        <p>10th from Sree Swamy Vivekananda High School, Pulivendula in 2019 <span> with 9.0 GPA </span>.</p>
    </section>

    <section id="skills">
        <h2>Skills</h2>
        <p>Technical: HTML, CSS, Bootstrap, Basic DataBase Management, Java</p>
        <p>Soft Skills: Effective Communication, Problem-Solving, Time Management, Team Work</p>
    </section>

    <section id="projects">
        <h2>Projects</h2>
        <p>I successfully developed a <span>fully responsive website using HTML, CSS, and Bootstrap,</span> <br> ensuring optimal user experience across various devices and screen sizes.</p>
        <a href="https://sree5113.github.io/webworks/"> <img src="./web.png" alt="" height="90px"> </a>
        <p>This is a basic <span> GUI-based calculator application developed in Java using the Swing library</span> <br>. It performs fundamental arithmetic operations like <span> addition, subtraction, multiplication, and division,</span> along with additional functionalities <br> like <span> clearing, deleting, negation, and decimal calculations</span>.</p>
        <a href="https://github.com/sree5113/project_cal"><img src="./cal.jpeg" alt="" height="90px"></a>

    </section>


    <section id="contact">
        <h2>Contact</h2>
        <p>Email: <a href="mailto:vsr5113@gmail.com">vsr5113@gmail.com</a></p>
        <p>Phone: <a href="tel:7893229663">7893229663</a></p>
        <h2>Address</h2>
        <p>Home Address:<br>
            4/7/316/21 Nagalakatta Street,<br>
            Pulivendula,Kadapa(Dist) 516390.</p>
            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d966.032830706942!2d78.2156100694785!3d14.419592297985695!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bb3ebcf81f98283%3A0x17397b623a294eb!2sPulivendula%2C%20Andhra%20Pradesh%20516390!5e0!3m2!1sen!2sin!4v1735443170516!5m2!1sen!2sin" width="300" height="250" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
            <h2>Thank you for choosing me</h2>
    </section>

    <footer>
        <p>&copy; 2024 Sreenivas Reddy. All Rights Reserved.</p>
    </footer>

    <script>
        function toggleMenu() {
            const navbar = document.querySelector('.navbar');
            navbar.classList.toggle('active');
        }
    </script>

</body>
<script src="./p.js" text="js"></script>
</html>
