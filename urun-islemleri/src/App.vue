<template>
  <div>
    <app-header></app-header>
    <router-view></router-view>
  </div>
</template>

<script>
  import Header from "./components/Header";

  export default {
    data(){
      return {

      }
    },
    components:{
      appHeader: Header,
    }
  }
</script>

<style scoped>

</style>
