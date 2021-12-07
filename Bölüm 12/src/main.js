import Vue from 'vue'
import App from './App.vue'

Vue.directive("color", {
  bind(el, binding, vNode){
    if(binding.modifiers['delay']){
      setTimeout(()=>{
        binding.arg == "background" ? el.style.backgroundColor = binding.value : el.style.color = binding.value;
      }, 2000)
    }else {
      binding.arg == "background" ? el.style.backgroundColor = binding.value : el.style.color = binding.value;

    }

  }
});


new Vue({
  el: '#app',
  render: h => h(App)
})
