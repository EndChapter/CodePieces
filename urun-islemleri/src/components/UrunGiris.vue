<template>
    <div>
      <div class="container">
        <div class="row">
          <div class="col-6 offset-3 pt-3 card mt-5 shadow">
            <div class="card-body">
              <h3>Ürün İşlemleri</h3>
              <hr>
              <div class="form-group">
                <label>Ürün Adı</label>
                <input type="text" class="form-control" placeholder="Ürün adını giriniz..">
              </div>
              <div class="form-group">
                <label>Adet</label>
                <input type="text" class="form-control" placeholder="Ürün adetini giriniz..">
              </div>
              <div class="form-group">
                <label>Fiyat</label>
                <input type="text" class="form-control" placeholder="Ürün fiyatı giriniz..">
              </div>
              <div class="form-group">
                <label>Açıklama</label>
                <textarea cols="30" rows="5" placeholder="Ürüne ait bir açıklama giriniz..."
                          class="form-control"></textarea>
              </div>
              <hr>
              <button class="btn btn-primary">Kaydet</button>
            </div>
          </div>
        </div>
      </div>
      <nav class="navbar fixed-bottom  navbar-light" style="background-color: #e3f2fd;">
    <span class="navbar-text mr-auto">
        <strong>vuejsegitim.com</strong> | gkandemir
    </span>
        <span class="navbar-text navbar-nav my-2 my-lg-0 mr-3">
        <strong>Alış Tutarı : </strong>
        <span class="badge badge-danger">34,56</span>
    </span>
        <span class="navbar-text navbar-nav my-2 my-lg-0 mr-3">
        <strong>Satış Tutarı : </strong>
        <span class="badge badge-success">34,56</span>
    </span>
        <span class="navbar-text navbar-nav my-2 my-lg-0">
        <strong>Bakiye : </strong>
        <span class="badge badge-primary">34,56</span>
    </span>
      </nav>
<!--      <div class="loading">-->
<!--        <div class="lds-ripple">-->
<!--          <div></div>-->
<!--          <div></div>-->
<!--        </div>-->
<!--      </div>-->
    </div>
</template>

<script>
    export default {
        name: "UrunGiris"
    }
</script>

<style scoped>

</style>
