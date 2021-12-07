<template>
  <div id="app">
    <app-header></app-header>
    <router-view></router-view>
    <app-footer></app-footer>
  </div>
</template>

<script>
  import Header from "./components/header/Header";
  import Footer from "./components/footer/Footer";

  export default {
    components:{
      appHeader: Header,
      appFooter: Footer,
    },
    created() {
      this.$store.dispatch('getDBProds');
    }
  }
</script>

<style>

</style>
