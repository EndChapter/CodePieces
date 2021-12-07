import UrunListe from "./components/productProcess/UrunListe";
import UrunGiris from "./components/productProcess/UrunGiris";
import UrunCikis from "./components/productProcess/UrunCikis";



export const routes=[
  {path: '/',           component: UrunListe, name:'UrunListe'},
  {path: '/urungirisi', component: UrunGiris, name: 'UrunGiris'},
  {path: '/uruncikisi', component: UrunCikis, name: 'UrunCikis'}
];
