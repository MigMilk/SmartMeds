// buttons

// botão para confirmar o login "Confirm"
if(isset($_POST['BtnConfirmLogin'])){
    header("Location: http://localhost/wordpress_killme/?page_id=26);
die();
}

// botão "LogOut"
if(isset($_POST['BtnLogOut'])){
    header("Location: http://localhost/wordpress_killme/?page_id=31);
die();
}

// botão "EditPatient"
if(isset($_POST['BtnEditPatient'])){
    header("Location: http://localhost/wordpress_killme/?page_id=33);
die();
}

// botao "submit" das alterações da descrição do paciente
if(isset($_POST['BtnSubmitEditPatient'])){
    header("Location: http://localhost/wordpress_killme/?page_id=33);
die();
}

// botao pagina "stock"
if(isset($_POST['BtnStock'])){
    header("Location: http://localhost/wordpress_killme/?page_id=41);
die();
}

// botao de alterar o stock geral "EditStockGeneral"
if(isset($_POST['BtnEditStockGeneral'])){
    header("Location: http://localhost/wordpress_killme/?page_id=39);
die();
}

// botao "submit" das alterações do stock geral
if(isset($_POST['BtnSubmitStockGeneral'])){
    header("Location: http://localhost/wordpress_killme/?page_id=41);
die();
}

// botao pagina "medicine"
if(isset($_POST['BtnMedicine'])){
    header("Location: http://localhost/wordpress_killme/?page_id=35);
die();
}

// adicionar novos medicamentos "AddMedicines"
if(isset($_POST['BtnAddMedicines'])){
    header("Location: http://localhost/wordpress_killme/?page_id=37);
die();
}

// botao "submit" de adicionar novos medicamentos "SubmitMedicines"
if(isset($_POST['BtnSubmitMedicines'])){
    header("Location: http://localhost/wordpress_killme/?page_id=35);
die();
}