<?php
require "DataBaseTeste.php";
$db = new DataBaseTeste();
if (isset($_POST['user_login']) && isset($_POST['user_pass'])) {
    if ($db->dbConnect()) {
        if ($db->logInTeste("wp_users", $_POST['user_login'])) {
            echo "Login Success";
        } else echo "Username or Password wrong";
    } else echo "Error: Database connection";
} else echo "All fields are required";
?>
