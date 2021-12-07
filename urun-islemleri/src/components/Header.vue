<template>
  <nav class="navbar navbar-expand-lg navbar-dark" style="background-color: #563F7A">
    <router-link :to="{name: 'UrunListesi'}"
                 exact-active-class="active"
    class="" tag="div">
      <a class="navbar-brand">Ürün Listesi</a>
    </router-link>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav mr-auto">
        <router-link
        :to="{name: 'UrunGiris'}"
        tag="li" class="nav-item"
        exact-active-class="active"
        >
          <a class="nav-link">Ürün Listesi</a>
        </router-link>
        <router-link
          :to="{name: 'UrunCikisi'}"
          tag="li" class="nav-item"
          active-class="active"
        >
          <a class="nav-link">Ürün Çıkışı</a>
        </router-link>
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
