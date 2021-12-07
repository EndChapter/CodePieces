import Vue from 'vue'
import App from './App.vue'

export const eventBus = new Vue({
  methods : {
    sendToImageUrl: function (data) {
      this.$emit('data', data);
    }
  }
});

new Vue({
  el: '#app',
  render: h => h(App)
})
