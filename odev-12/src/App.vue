<template>
  <div class="container">
    <div class="col-md-6 col-md-offset-3">
      <h3>Directive Sınavı</h3>
      <!-- Soru -->
      <!-- Event'leri dinleyecek v-on gibi çalışan bir Directive geliştiriniz. -->
      <button v-addevent:click = "calis">Metodu Çalıştır</button>
    </div>
  </div>
</template>

<script>
export default {
  directives: {
    addevent : {
      bind(el, binding, vNode){
        el.addEventListener(binding.arg, binding.value);
      }
    }
  },
  methods:{
    calis(){
      console.log('ben çalıştım');
    }
  }
}
</script>

<style>
</style>
