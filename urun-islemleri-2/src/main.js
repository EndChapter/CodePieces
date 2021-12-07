import Vue from 'vue'
import App from './App.vue'
import store from './store'
import router from './router'

Vue.config.productionTip = false

Vue.filter("currency", (value) => {
  return parseFloat(value).toLocaleString(undefined, { minimumFractionDigits : 2}) + " TL"
})

new Vue({
  store,
  router,
  render: h => h(App)
}).$mount('#app')
