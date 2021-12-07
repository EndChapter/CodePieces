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
    path: '/urun-cikis',
    name: 'UrunCikis',
    component: ()=>require('../components/UrunCikis'),
  },
  {
    path: '/urun-giris',
    name: 'UrunGiris',
    component: ()=>require('../components/UrunGiris'),
  },
]

const router = new VueRouter({
  mode: 'history',
  routes
})

export default router
