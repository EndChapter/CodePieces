import Vue from 'vue'
import App from './App.vue'

export const eventBus = new Vue({
  data: {

  },
  methods: {
    changeStatus(stat){
      this.$emit('status', stat);
    },
    changeStatusId(id){
      this.$emit('id', id);
    }


  }
});
new Vue({
  el: '#app',
  render: h => h(App)
})
