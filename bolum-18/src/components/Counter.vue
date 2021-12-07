<template>
  <div>
    <button class="btn btn-success" @click="incrementCounter">+ Arttır</button>
    <button class="btn btn-danger" @click="decrementCounter">- Azalt</button>
    <hr>
    <button class="btn btn-success" @click="increment">+ Arttır</button>
    <button class="btn btn-danger" @click="decrement">- Azalt</button>
    <hr>
    <button class="btn btn-success" @click="incrementAsync(1000)">+ Async Arttır</button>
    <button class="btn btn-danger" @click="decrementAsync(1000)">- Async Azalt</button>
  </div>
</template>

<script>
  import {mapMutations} from 'vuex';
  import {mapActions} from 'vuex';
export default {
  methods : {
      ...mapMutations({
        incrementCounter: 'increaseCounter',
        decrementCounter: 'decreaseCounter',
    }),
      ...mapActions([
        'increment',
        'decrement',
        'incrementAsync',
        'decrementAsync',
      ]),
    // increment(){
    //     this.$store.dispatch('increment')
    // },
    // decrement(){
    //   this.$store.dispatch('decrement')
    // },
    // incrementAsync(){
    //   this.$store.dispatch('incrementAsync')
    // },
    // decrementAsync(){
    //   this.$store.dispatch('decrementAsync')
    // }
  }
}
</script>

<style>
</style>
