import Vue from 'vue'
import App from './App.vue'

export const eventBus= new Vue({
  data :{
    status : "",
  },
  methods : {
    changeStatus: function(status) {
      this.status = status;
    }
  }
});


new Vue({
  el: '#app',
  render: h => h(App)
})
