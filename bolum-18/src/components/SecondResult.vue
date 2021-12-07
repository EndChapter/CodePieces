<template>
  <div>
    <p class="counter-container"> Sayaç : {{double}}</p>
    <p class="counter-container"> Sayaç : {{stringC}}</p>
    <input type="text" v-model="value">
    <p>{{value}}</p>
  </div>
</template>
<script>
  import {mapGetters} from 'vuex';
  export default {
    computed: {
      ...mapGetters({
                   double: 'getDoubleCounter',
                   stringC: 'getStringCounter',
                 }),
      value:{
        get(){
          return this.$store.getters.getValue;
        },
        set(value){
          this.$store.commit('setValue', value)
        }
      }
    },
    methods:{
      setValue($event){
        this.$store.commit('setValue', $event.target.value)
      }
    }
  }

</script>
<style scoped>
  .counter-container{
    border: 1px solid #aa5c08;
    padding: 10px 5px;
    background-color: #fbbd08;
    font-size: 20px;
    color: #000;
  }
</style>
