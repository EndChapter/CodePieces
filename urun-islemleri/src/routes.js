import UrunListesi from "./components/UrunListesi";

const UrunCikisi = ()=>import('./components/UrunCikisi.vue');
const UrunGiris = ()=>import('./components/UrunGiris')



export const routes = [
  { path: '', component: UrunListesi, name: 'UrunListesi'},
  { path: '/urun-cikisi', component: UrunCikisi, name: 'UrunCikisi'},
  { path: '/urun-giris', component: UrunGiris, name: 'UrunGiris'},
  { path: '*', redirect: '/'},
]
