<template>
  <nav class="navbar navbar-expand-lg navbar-dark" style="background-color: #563F7A">
    <router-link
    :to="{name: 'UrunListe'}"
    tag="a" class="navbar-brand"
    exact-active-class="active">
      Ürün Listesi
    </router-link>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item">
          <router-link
            :to="{name: 'UrunGiris'}"
            tag="a" class="nav-link"
            active-class="active">
            Ürün İşlemleri
          </router-link>
        </li>
        <li class="nav-item">
          <router-link
            :to="{name: 'UrunCikis'}"
            tag="a" class="nav-link"
            active-class="active">
            Ürün Çıkışı
          </router-link>
        </li>
      </ul>
    </div>
  </nav>
</template>

<script>
    export default {
        name: "Header"
    }
</script>

<style scoped>

</style>
