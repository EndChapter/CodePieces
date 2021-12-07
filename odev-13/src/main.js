import Vue from 'vue'
import App from './App.vue'

Vue.filter('arraysize',(data)=>{
  return data + '(' + data.split('').length + ')'
})
new Vue({
  el: '#app',
  render: h => h(App)
})
