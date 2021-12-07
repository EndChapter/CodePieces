import Vue from 'vue'
import VueRouter from 'vue-router'
import UrunListe from "../components/UrunListe";

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'UrunListe',
    component: UrunListe,
  },
  {
    path: '/comps.css',
    name: '',
    component: import('../assets/css/components.css')
  },
  {
    path: '/urun-cikis',
    name: 'UrunCikis',
    component: ()=>import('../components/UrunCikis'),
  },
  {
    path: '/urun-giris',
    name: 'UrunGiris',
    component: ()=>import('../components/UrunGiris'),
  },
]

const router = new VueRouter({
  mode: 'history',
  routes,
})

export default router
