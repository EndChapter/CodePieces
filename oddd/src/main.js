import Vue from 'vue'
import App from './App.vue'

export const eventBus = new Vue({
  methods : {
    sendServerData(data){
      this.$emit('sentData', data);
    }
  }
});
new Vue({
  el: '#app',
  render: h => h(App)
})
