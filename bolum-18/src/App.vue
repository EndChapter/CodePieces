<template>
  <div class="container">
    <div class="row">
      <div class="col-md-6 col-md-offset-3">
        <h1 class="text-center">VUEX</h1>
        <hr>
        <app-result></app-result>
        <hr>
        <app-second-result></app-second-result>
        <hr>
        <app-counter></app-counter>
      </div>
    </div>
  </div>
</template>

<script>
  import Result from "./components/Result";
  import Counter from "./components/Counter";
  import SecondResult from "./components/SecondResult";
  export default {
    data(){
      return {

      }
    },
    components: {
      appResult: Result,
      appCounter: Counter,
      appSecondResult: SecondResult
    }
  }
</script>

<style>
</style>
