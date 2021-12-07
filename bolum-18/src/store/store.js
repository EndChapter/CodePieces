import Vue from 'vue';
import Vuex from 'vuex';
import counter from "./modules/counter";
import * as state from './modules/state';
import * as mutations from './modules/mutations';
import * as getters from './modules/getters';
import * as actions from './modules/actions';

Vue.use(Vuex);


export const store = new Vuex.Store({
   state,
    getters,
    mutations,
    actions,
    modules:{
       counter
    }
});