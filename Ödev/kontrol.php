<!DOCTYPE html>
<html>
  <head>
    <!--Import Google Icon Font-->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!--Import materialize.css-->
    <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>

    <!--Let browser know website is optimized for mobile-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  </head>

  <body>
    <?php //Çıkış yapma ayarı
    session_start();
    $username= "root";
    $password= "1234";
    try{
      $dbh = new PDO('mysql:host=localhost;dbname=oturum', $username, $password);
      $dbh->query("SET CHARACTER SET utf8");;

    } catch (PDOException $e) {
      print "Hata!: " . $e->getMessage() . "<br/>";
      die();
    }

    if(isset($_POST["signupad"])&&isset($_POST["signupsoyad"])&&isset($_POST["signuppwd"])&&isset($_POST["signupemail"])){

      $query1 = $dbh->prepare("SELECT email FROM Login WHERE email = :id");
      $query1->bindParam(':id', $id);
      $id = $_POST["signupemail"];
      $query1->execute();
      $result1 = $result1=$query1->fetch(PDO::FETCH_ASSOC);
      if (is_array($result1) &&implode($result1) == $_POST["signupemail"]){
          header("Location: signup.php?id=1");
      }else{
        $query1 = $dbh->prepare("INSERT INTO Login (ad, soyad, email, sifre) VALUES (:ad, :soyad, :email, :sifre)");
        $query1->bindParam(':ad', $ad);
        $query1->bindParam(':soyad', $soyad);
        $query1->bindParam(':email', $email);
        $query1->bindParam(':sifre', $pwd);
        $ad = $_POST["signupad"];
        $soyad = $_POST["signupsoyad"];
        $pwd = $_POST["signuppwd"];
        $email =  $_POST["signupemail"];
        $query1->execute();
        $_SESSION['oturumad'] = $ad;
        $_SESSION['oturumsoyad'] = $soyad;
        setcookie('oturumad', $ad, time()+ (86400 * 15));
        setcookie('oturumsoyad', $soyad, time()+ (86400 * 15));
      }
    }else if(isset($_POST["email"])&&isset($_POST["sifre"])){
      $query = $dbh->prepare("SELECT * FROM Login WHERE email = :id");
      $query->bindParam(':id', $id);
      $id = $_POST["email"];
      $query->execute();
      $result = $result=$query->fetch(PDO::FETCH_ASSOC);
      if (is_array($result)&& $result['email'] == $_POST["email"] && $result['sifre'] == $_POST["sifre"]){
        $isim = $result['ad'];
        $soyad = $result['soyad'];
        setcookie('oturumad', $isim , time()+ (86400 * 15));//todo burası da veritabanından fıçk
        setcookie('oturumsoyad', $soyad, time()+ (86400 * 15));//todo burası veritabanından fıçklanacak
        $_SESSION['oturumad'] = $isim;
        $_SESSION['oturumsoyad'] = $soyad;
      }else{
        header("Location: login.php?id=1");
      }


    }else if(isset($_COOKIE['oturumad'])&&isset($_COOKIE['oturumsoyad'])){
      $_SESSION['oturumad'] = $_COOKIE['oturumad'];
      $_SESSION['oturumsoyad'] = $_COOKIE['oturumsoyad'];
    }else if(!isset($_POST["signupad"])&&!isset($_POST["signupsoyad"])&&!isset($_POST["signuppwd"])&&!isset($_POST["signupemail"])&&!isset($_POST["ad"])&&!isset($_POST["soyad"])&&!isset($_COOKIE['oturumad'])&&!isset($_COOKIE['oturumsoyad'])){
      header("Location: login.php");
    }else{
      echo "Tanımlanmayan hata.";
    }
    function logout(){
      setcookie('oturumad', "", time()-3600);
      setcookie('oturumsoyad', "", time()-3600);
      session_destroy();
    }
    ?>


    <!--JavaScript at end of body for optimized loading-->
    <script type="text/javascript" src="js/materialize.min.js"></script>
  </body>
</html>
