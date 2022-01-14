displayuserpatients

<?php

global $current_user;
wp_get_current_user();

global $wpdb;
$result = $wpdb->get_results( "SELECT * FROM utente WHERE  CID = $current_user->ID");

echo "<style>";
echo "body {font-family: Arial;}";

echo ".table_container { padding: 10px 12px 0px 12px;  border: 1px solid #ccc;  }";
echo ".table_container th { background-color:lightblue; color:white; font-weight:bold; border-left: 1px solid white;}";
echo "</style></head>";
echo "<body>";
echo "<div class=\"table_container\"><table>";
echo "<tr><th style=\"padding-left:10px;\">UID</th><th>CID</th><th>name</th><th>age</th><th>description</th></tr>";
foreach ($result as $row) {
	echo "<tr><td>" . $row->id . "</td><td>" . $row->CID . "</td><td>" . $row->name . "</td><td>" . $row->extra_info. "</tr>";
}
echo "</table></div>";
?>

displaypatient

<?php

global $wpdb;
$result = $wpdb->get_results( "SELECT ID, name, age,description FROM patient");
echo "<h3>List of patients in the database</h3>";
echo "<style>";
echo "body {font-family: Arial;}";

echo ".table_container { padding: 10px 12px 0px 12px;  border: 1px solid #ccc;  }";
echo ".table_container th { background-color:lightblue; color:white; font-weight:bold; border-left: 1px solid white;}";
echo "</style></head>";
echo "<body>";

echo "<div class=\"table_container\"><table>";
echo "<tr><th style=\"padding-left:10px;\">ID</th><th>name</th><th>age</th><th>description</th></tr>";
foreach ($result as $row) {
	echo "<tr><td>" . $row->ID . "</td><td>" . $row->name . "</td><td>" . $row->age . "</td><td>" . $row->description. "</tr>";
}
echo "</table></div>";

?>

displayuser


<?php global $current_user;
    wp_get_current_user();

 echo "<style>";
echo "body {font-family: Arial;}";

echo ".table_container { padding: 10px 12px 0px 12px;  border: 1px solid #ccc;  }";
echo ".table_container th { background-color:lightblue; color:white; font-weight:bold; border-left: 1px solid white;}";
echo "</style></head>";
echo "<body>";

echo "<div class=\"table_container\"><table>";
echo "<tr><th style=\"padding-left:10px;\">Caretaker ID</th><th>Name</th><th>Email</th></tr>";
echo "<tr><td>" . $current_user->ID . "</td><td>" . $current_user->user_nicename  . "</td><td>" . $current_user->user_email . "</tr>";
?>

display


<?php

global $wpdb;
$result = $wpdb->get_results( "SELECT user_login, user_pass, user_email FROM wp_users");

echo "<style>";
echo "body {font-family: Arial;}";

echo ".table_container { padding: 10px 12px 0px 12px;  border: 1px solid #ccc;  }";
echo ".table_container th { background-color:lightblue; color:white; font-weight:bold; border-left: 1px solid white;}";
echo "</style></head>";
echo "<body>";

echo "<div class=\"table_container\"><table>";
echo "<tr><th style=\"padding-left:10px;\">Name</th><th>pass</th><th>mail</th></tr>";
foreach ($result as $row) {
	echo "<tr><td>" . $row->user_login . "</td><td>" . $row->user_pass . "</td><td>" . $row->user_email. "</tr>";
}
echo "</table></div>";

?>


