<?php //Çıkış yapma ayarı
session_start();
$username= "root";
$password= "1234";
try{
  $dbh = new PDO('mysql:host=localhost;port=3307;dbname=oturum;charset=utf8', $username, $password);

} catch (PDOException $e) {
  print "Hata!: " . $e->getMessage() . "<br/>";
  die();
}
$query = $dbh->prepare("SELECT dest FROM Login WHERE ad = :id ");
$query->bindParam(':id', $id);
$id = $_SESSION['oturumad'];
$query->execute();
$result=$query->fetch(PDO::FETCH_ASSOC);
echo "<img src = "$result['dest']"></img>";
?>
