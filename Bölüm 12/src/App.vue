<template>
  <div class="container">
    <div class="row">
      <div class="col-md-6 col-md-offset-3">
        <h3>VueJS ile gelen Directive Tanımları</h3>
        <p v-text="'Deneme yanilma metodu her zaman iyidir..'"></p>
        <p v-html="'<strong>Bu da v-html</strong>'"></p>
      </div>
    </div>
    <hr>
    <div class="row">
      <div class="col-md-6 col-md-offset-3">
        <h3>Custom Directive</h3>
        <p v-color:background.delay.flash="'green'">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Asperiores aspernatur beatae culpa doloribus, ex
          facilis fugiat, fugit magni molestiae mollitia, nesciunt nihil perspiciatis quaerat quam quas ratione sequi
          unde ut!</p>
        <p v-color.delay="'red'">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Asperiores aspernatur beatae culpa doloribus, ex
          facilis fugiat, fugit magni molestiae mollitia, nesciunt nihil perspiciatis quaerat quam quas ratione sequi
          unde ut!</p>
      </div>
    </div>

  </div>
</template>

<script>
  export default {
    directives : {
      'color' : {
        bind(el, binding, vNode){
          let delay = 0;

          if(binding.modifiers['delay']){
            setTimeout(()=>{
              binding.arg == "background" ? el.style.backgroundColor = binding.value : el.style.color = binding.value;
            }, 2000)
          }else {
            binding.arg == "background" ? el.style.backgroundColor = binding.value : el.style.color = binding.value;

          }
          if(binding.modifiers['flash']){
            let firstColor = binding.value;
            let secondColor = "#fbbd08";
            let currentColor = firstColor;
            setInterval(()=>{
              currentColor == secondColor ? currentColor = firstColor : currentColor = secondColor;
              if(binding.arg=='background'){
                el.style.backgroundColor = currentColor;
              }
            }, 1000)
          }
        }
      }
    }
  }
</script>

<style>

</style>
