import Vue from 'vue'
import App from './App.vue'
import VueRouter from 'vue-router'
import VueResource from 'vue-resource'
import {routes} from './routes'
import {store} from './store/store'

Vue.use(VueRouter)
Vue.use(VueResource)
Vue.http.options.root = 'https://vue-urun-islemleri-6d8fd-default-rtdb.firebaseio.com/'


export const router = new VueRouter({
  mode: 'history',
  routes,
});

new Vue({
  el: '#app',
  router,
  store,
  render: h => h(App),
})
