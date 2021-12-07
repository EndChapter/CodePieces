import Vue from 'vue';
import Vuex from 'vuex';

Vue.use(Vuex);

export const store = new Vuex.Store({
  state:{
    products: [],
  },
  getters:{
    getProducts(state){

      return state.products;
    }
  },
  mutations:{
    setProducts(state, payload){
      state.products.push(payload);
    }
  },
  actions:{
    getFbProducts({commit}, payload){
      Vue.http.get('https://vue-urun-islemleri-6d8fd-default-rtdb.firebaseio.com/products.json').then(response=>{commit('setProducts', response.data)}, response=>{});
    }
  }
});
