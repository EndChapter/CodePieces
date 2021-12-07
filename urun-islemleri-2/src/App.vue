<template>
  <div id="app">
    <app-header></app-header>
    <transition name="fade" mode="out-in">
      <router-view></router-view>
    </transition>
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
.fade-enter{
  opacity: 0;
}
.fade-enter-active{
  opacity: 1;
  transition: 0.5s linear;
}
.fade-leave{

}
.fade-leave-active{
  opacity: 0;
  transition: 0.5s linear;
}
</style>
