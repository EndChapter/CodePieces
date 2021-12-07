import Vue from 'vue'
import Vuex from 'vuex'
import VueResource from 'vue-resource'


Vue.use(Vuex)
Vue.use(VueResource)
Vue.http.options.root= "https://vue-urun-islemleri-6d8fd-default-rtdb.firebaseio.com/"

export default new Vuex.Store({
  state: {
    products: [],
  },
  getters:{
    getProducts(state){
      return state.products;
    },
  },
  mutations: {
    setProducts(state, payload){
      state.products.push(payload);
    },
    resetProducts(state){
      state.products= []
    },
  },
  actions: {
    getDBProds(context){
      context.commit('resetProducts');
      Vue.http.get('https://vue-urun-islemleri-6d8fd-default-rtdb.firebaseio.com/products.json', '')
          .then(response=>{
              let key;
              for(key in response.data){

                response.data[key].key= key;
                context.commit('setProducts', response.data[key]);
              }

          })
    },
    setDBProds(context, payload){
      Vue.http.post('https://vue-urun-islemleri-6d8fd-default-rtdb.firebaseio.com/products.json', payload)
          .then(()=>{console.log('post succeed'); }, ()=>{console.log('post not succeed')})
    },
    updateDBProds(context, payload){
      console.log(payload.satisAdeti)
      console.log(payload.satisFiyati)
      Vue.http.patch('https://vue-urun-islemleri-6d8fd-default-rtdb.firebaseio.com/products/'+payload.key +'.json', {satisAdeti: payload.satisAdeti, satisFiyati: payload.satisFiyati})
          .then(()=>{console.log('update succeed'); }, ()=>{console.log('update not succeed')})
    }
  },
  modules: {

  }
})
